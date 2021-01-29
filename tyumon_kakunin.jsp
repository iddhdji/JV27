<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>注文確認</title>

    <link rel="stylesheet" type="text/css" href="css/common.css">
            <link rel="stylesheet" type="text/css" href="css/menu.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

  </head>

    <header>
    まさる堂
     <form action="member.html">
    <input type="submit" name="member" value="会員リスト" style="width: 170px; height: 40px; font-size: 30px; text-align: center; background-color: #fff; margin-left: 1150px;">
  </form>
  </header>

<nav>
<ul>
<li><a class=”current” href="reservation.jsp">RESERVATION</a></li>
<li><a href="room.html">ROOM</a></li>
<li><a href="./order.html">ORDER</a></li>
<li><a href="./check.html">CHECK</a></li>
<li><a href="./employ.html">EMPLOY</a></li>
<li><a href="./profit.html">PROFIT</a></li>
</ul>
</nav>

  <body>
    <form  action="order.jsp" method="get">
<input type="submit" name="戻る" value="戻る" src="tyumon_uketuke.jsp" class="btn btn-primary btn-lg">
</form>
<h1 class="text-primary font-weight-bold">注文確認</h1>
<form  action="tyumon_kanryo.jsp" method="get">
<h2 class="text-primary font-weight-bold"></h2>
<table class="table">
  <tr>
    <td colspan="2"><a href="uketuke.jsp"><img src="image/yakisoba.jpg" alt="yakisoba"></a></td>
  </tr>
  <tr>
<td>名称</td>
<td>焼きそば</td>
  </tr>
    <tr>
<td>値段</td>
<td><input type="text" name="nedan" value="500"></td>
  </tr>
    <tr>
<td>個数</td>
<td><input type="text" name="kosuu" value="1"></td>
  </tr>
</table>
<p><input type="submit" value="注文する" class="btn btn-success btn-lg"></p>

</form>
<form action="tyumon_kakunin_error.jsp" method="get">
<input type="submit" value="エラー表示">
</form>
  </body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

</html>
