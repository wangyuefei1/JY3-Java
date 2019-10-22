window.onload = function () {
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

    }
    else {
        alert("验证码错误");
    }
}
}