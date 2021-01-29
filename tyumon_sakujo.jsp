<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>注文削除</title>

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
<form action="order.html" method="get">
<input type="submit" name="戻る" value="戻る" class="btn btn-primary btn-lg">
</form>

<h1 class="text-primary font-weight-bold">注文削除</h1>
<form action="tyumon_sakujo_error.html" method="get">
<input type="submit" value="エラー表示">
</form>

<form action="tyumon_sakujo_kanryo.html" method="get">
<table class="table">
  <tr>
    <td>注文コード</td>
    <td>名称</td>
    <td>値段</td>
    <td>個数</td>
    <td>注文日時</td>
    <td>削除</td>
  </tr>
  <tr>
    <td>50001</td>
    <td>フライドポテト</td>
    <td>350</td>
    <td>1</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>サラダ</td>
    <td>400</td>
    <td>1</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>枝豆</td>
    <td>250</td>
    <td>1</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>たこ焼き</td>
    <td>400</td>
    <td>1</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>ミルクティー</td>
    <td>400</td>
    <td>2</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>コーラ</td>
    <td>400</td>
    <td>2</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
  <tr>
    <td>50001</td>
    <td>ウーロン茶</td>
    <td>400</td>
    <td>1</td>
    <td>2020/8/24 10:00</td>
    <td><input type="submit" name="sakujo" value="削除する" class="btn btn-primary btn-lg"></td>
  </tr>
</table>
</form>

  </body>
<script type="text/javascript" src="js/bootstrap.min.js" class="btn btn-primary btn-lg"></script>

</html>
