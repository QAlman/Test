FROM python:3.9-bullseye
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        wget \
        curl \
        unzip \
        libnss3 \
        libatk-bridge2.0-0 \
        libdrm2 \
        libgbm1 \
        libxkbcommon0 \
        libasound2 \
        fonts-liberation \
        libu2f-udev \
        libvulkan1 \
        libappindicator3-1 \
        xdg-utils \
        default-jdk && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/* && \
    rm -rf /usr/bin/google-chrome

RUN wget -q "https://storage.googleapis.com/chrome-for-testing-public/131.0.6778.87/linux64/chromedriver-linux64.zip" && \
    wget -q "https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb" && \
    unzip chromedriver-linux64.zip -d /opt/ && \
    dpkg -i google-chrome-stable_current_amd64.deb && \
    ln -sf /opt/chromedriver-linux64/chromedriver /usr/bin/chromedriver && \
    ln -sf /opt/google-chrome-stable_current_amd64/google-chrome-stable /usr/bin/google-chrome && \
    rm -rf chromedriver-linux64.zip google-chrome-stable_current_amd64.deb

RUN curl -o allure-2.19.0.tgz -OLs https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.19.0/allure-commandline-2.19.0.tgz && \
    tar -zxvf allure-2.19.0.tgz -C /opt/ && \
    ln -s /opt/allure-2.19.0/bin/allure /usr/bin/allure && \
    rm -rf allure-2.19.0.tgz
COPY requirements.txt .
RUN pip install --upgrade pip
COPY . /atolimpbet
WORKDIR /atolimpbet
ENV DISPLAY=:99
CMD ["pytest", "--alluredir=/allure-results"]
