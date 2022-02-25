<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>join</title>
</head>
<body>
    <header>
        <h3>로그인</h3>
    </header>
    <section>

        아이디:
        <input type="text" placeholder="아이디" />
        <button>중복확인</button> <br />

        이름: 
        <input type="text" placeholder="이름" /><br />

        암호: 
        <input type="password" placeholder="암호" /><br />

        암호: 
        <input type="password" placeholder="암호확인" /><br />

        이메일: 
        <input type="text" /> @ 
        <select name='이메일'>
            <option value='' selected>-- 선택 --</option>
            <option value='google.com'>google.com</option>
            <option value='naver.com'>naver.com</option>
            <option value='kakao.com'>kakao.com</option>
        </select>
        <br />

        관심분야: 
        <input type="checkbox" name="html" />
        <input type="checkbox" name="css" />
        <input type="checkbox" name="vue" />
        <input type="checkbox" name="java" />
        <input type="checkbox" name="spring" />
        <br />

        <button>회원가입</button>

    </section>
</body>
</html>