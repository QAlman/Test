//from https://codeception.com/docs/10-APITesting


class CreateUserCest
{
    // tests
    public function createUserViaAPI(\ApiTester $I)
    {
        //$I->amHttpAuthenticated('service_user', '123456');


//Simple POST

        $I->haveHttpHeader('Content-Type', 'application/json');
        $I->sendPOST('/user/create', [
        'name' => 'first',
        'email' => 'first@mail.tt',
        'password' => '145346435645yth',
        ]);
        $I->seeResponseCodeIsSuccessful();
        $I->seeResponseIsJson();
        $I->seeResponseContains('{"result":"ok"}');



//Validation JSON

        $I->haveHttpHeader('Content-Type', 'application/json');
        $I->sendGet('/users/get');
        $I->seeResponseCodeIs(HttpCode::OK); // 200
        $I->seeResponseIsJson();
        $I->seeResponseMatchesJsonType([
        'id' => 'integer',
        'name' => 'string',
        'email' => 'string:email',
        'password' => 'string',
        'created_at' => 'string:date',
        'updated_at' => 'string:date'
        ]);

//Validation JSON 2

        $I->haveHttpHeader('Content-Type', 'application/json');
        $I->sendGet('/users/get');
        $I->seeResponseContainsJson(['result' => 'ok']);
        // it can match tree-like structures as well
        $I->seeResponseContainsJson([
        'name' => 'First',
        'email' => 'First@mail.tt',
        'password' => 'not null'
        ]);



    }
