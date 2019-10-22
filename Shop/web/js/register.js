window.onload = function () {
    var str = /^[0-9a-zA-Z]{6,12}$/;
    var btn1 = document.getElementById("btn1");
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    var user = document.getElementById("user");
    var psw = document.getElementById("psw");
    username.onfocus = function () {
        user.innerText = "请输入6-12位数字或字母"
    }
    username.onblur = function () {
        var val = this.value;
        var result = str.test(val);
        if (result == true) {
            user.innerText = "可以注册";
        } else {
            user.innerText = "重新输入";
        }
    }
    password.onfocus = function () {
        psw.innerText = "请输入6-12位数字或字母"
    }
    password.onblur = function () {
        var val = this.value;
        var result = str.test(val);
        if (result == true) {
            psw.innerText = "可以注册";
        }
        else {
            psw.innerText = "重新输入";
        }
    }

    var yanz = document.getElementById("yanz");
    var yan = document.getElementById("yan");

    //获取验证码
    function getcode() {
        var array = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'q', 'w', 'e', 'r');
        var str = "";
        for (var i = 0; i < 4; i++) {
            var num = Math.floor(Math.random() * 14);
            str += array[num];
        }
        return str;
    }
    var yan1
    yanz.onfocus = function () {
        yan1 = getcode();
        yan.innerText = yan1;
    }
    yanz.onblur = function () {
        var result = this.value;
        if (yan1 == result)
        {
            alert("成功");
        }
        else {
            alert("错误");
        }
    }
}