<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>注文管理</title>

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
    <form action="order.jsp" method="get">
<input type="submit" name="戻る" value="戻る" class="btn btn-primary btn-lg">
</form>
<h1 class="text-primary font-weight-bold">注文管理</h1>
<form>
<table class="table">
  <tr>
    <td>会員コード</td>
    <td>注文コード</td>
    <td>注文日時</td>
  </tr>
  <tr>
    <td>50030</td>
    <td>50001</td>
    <td>2020/8/24 10:00</td>
  </tr>
</table>
</form>

  </body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

</html>
