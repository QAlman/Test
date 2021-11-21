import pytest
import requests
import json


class Test_Weather_1():
    @pytest.fixture()
    def test_get_1(self):
        base_url_1 = 'https://api.openweathermap.org/data/2.5/weather?id=2172797&appid=a9f313ba6bbf77ae0ee73398204d1d91'
        response = requests.get(base_url_1)
        assert response.status_code == 200
        resp = response.json()
        str_1 = resp['weather']
        str_2 = str_1[0]
        str_3 = str_2['main']
        print("\n\n" + str_3 + "  current")
        return resp

    def test_get_2(self, test_get_1):
        base_url_1 = 'https://api.openweathermap.org/data/2.5/onecall/timemachine?lat=-16.91667&lon=145.766663&dt=1637070454&appid=a9f313ba6bbf77ae0ee73398204d1d91'
        response = requests.get(base_url_1)
        assert response.status_code == 200

        resp_2 = response.json()
        str_2_1 = resp_2['current']
        str_2_2 = str_2_1['weather']
        str_2_3 = str_2_2[0]
        str_2_4 = str_2_3['main']
        print("\n\n" + str_2_4 + "  history - 5 day ago")
        return resp_2
