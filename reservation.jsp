<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>予約</title>

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
<li><a class=”current” href="reservation.html">RESERVATION</a></li>
<li><a href="room.html">ROOM</a></li>
<li><a href="./order.html">ORDER</a></li>
<li><a href="./check.html">CHECK</a></li>
<li><a href="./employ.html">EMPLOY</a></li>
<li><a href="./profit.html">PROFIT</a></li>
</ul>
</nav>

  <body>

<h1 class="text-primary font-weight-bold">予約</h1>
<table class="table">
  <tr>
<td><form action="yoyaku_touroku.jsp" method="get">
<input type="submit" name="予約登録" value="予約登録" class="btn btn-primary btn-lg">
</form></td>
<td><form action="yoyaku_henkou.jsp" method="get">
<input type="submit" name="予約変更" value="予約変更" class="btn btn-primary btn-lg">
</form></td>
<td><form action="yoyaku_cancel.jsp" method="get">
<input type="submit" name="予約キャンセル" value="予約キャンセル" class="btn btn-primary btn-lg">
</form></td>
</tr>
</table>
  </body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>
