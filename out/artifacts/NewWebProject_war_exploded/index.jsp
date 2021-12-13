
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <script src="https://eqcn.ajz.miesnfu.com/wp-content/plugins/wp-3d-pony/live2dw/lib/L2Dwidget.min.js"></script>
  <!--小帅哥： https://unpkg.com/live2d-widget-model-chitose@1.0.5/assets/chitose.model.json-->
  <!--萌娘：https://unpkg.com/live2d-widget-model-shizuku@1.0.5/assets/shizuku.model.json-->
  <!--小可爱（女）：https://unpkg.com/live2d-widget-model-koharu@1.0.5/assets/koharu.model.json-->
  <!--小可爱（男）：https://unpkg.com/live2d-widget-model-haruto@1.0.5/assets/haruto.model.json-->
  <!--初音：https://unpkg.com/live2d-widget-model-miku@1.0.5/assets/miku.model.json-->
  <!-- 上边的不同链接显示的是不同的小人，这个可以根据需要来选择 下边的初始化部分，可以修改宽高来修改小人的大小，或者是鼠标移动到小人上的透明度，也可以修改小人在页面出现的位置。 -->
  <script>
    /*https://unpkg.com/live2d-widget-model-shizuku@1.0.5/assets/shizuku.model.json*/
    L2Dwidget.init({ "model": { jsonPath:
                "https://unpkg.com/live2d-widget-model-shizuku@1.0.5/assets/shizuku.model.json",
        "scale": 1 }, "display": { "position": "right", "width": 385, "height": 525,
        "hOffset": 0, "vOffset": -20 }, "mobile": { "show": true, "scale": 0.5 },
      "react": { "opacityDefault": 0.8, "opacityOnHover": 0.1 } });
  </script>

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="css/bootstrap.min.css">

  <!-- Loding font -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:300,700" rel="stylesheet">

  <!-- Custom Styles -->
  <link rel="stylesheet" type="text/css" href="./css/styles.css">

  <title>鸡蛋网-登录</title>
</head>
<body>

<!-- Backgrounds -->

<div id="login-bg" class="container-fluid">
  <div class="bg-img"></div>
  <div class="bg-color"></div>
</div>

<!-- End Backgrounds -->

<div class="container" id="login">
  <div class="row justify-content-center">
    <div class="col-lg-8">
      <div class="login">

        <h1>登录</h1>

        <!-- Loging form -->
        <form action="/LoginServlet" method="post">
          <div class="form-group">
            <input type="text" class="form-control" id="exampleInputText1" aria-describedby="emailHelp" name="username" placeholder="请输入用户名">
          </div>
          <div class="form-group">
           <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="请输入密码">
          </div>

          <div class="form-check">

            <%--@declare id="examplecheck1"--%><label class="switch">
              <input type="checkbox" name="likeme" checked>
              <span class="slider round"></span>
            </label>
            <label class="form-check-label" for="exampleCheck1">记住我</label>

            <label class="forgot-password"><a href="reg.jsp">没有账号?立即注册！</a></label>

          </div>

          <br>
          <button type="submit" class="btn btn-lg btn-block btn-success">立即登录</button>
        </form>
        <!-- End Loging form -->
      </div>
    </div>
  </div>
</body>
</html>