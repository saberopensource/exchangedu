/**
 *  Created by baiyang
 *  Email: 1419408386@qq.com
 *  Creation time : 2017/5/21
 */
function apassword(){
    var phoneNum=document.getElementsByName("phoneNum").valueOf();
    var password=document.form1.password.valueOf();//获取密码框的值
    var youword=document.form1.youword.valueOf();//获取重新输入的密码值
    console.log(phoneNum);
    if (password == " "){
        alert("请输入密码");
        document.form1.password.onfocus;
        return false;
    }
    if(youword != password){
       document.getElementsByName("youword");
    }
}
