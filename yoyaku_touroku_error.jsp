<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>予約登録</title>

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
                <form action="reservation.html" method="get">
<input type="submit" name="戻る" value="戻る" class="btn btn-primary btn-lg">
</form>
<h1 class="text-primary font-weight-bold">予約登録</h1>
<h3 style="color:red">登録出来ません</h3>
<form action="yoyaku_kanryo.html" method="get">
    <table class="table">
      <tr>
        <td class="text-light bg-primary">会員番号</td>
        <td><input type="50030" name="kaiinbango" value="50030"></td>
      </tr>
      <tr>
        <td class="text-light bg-primary">人数</td>
        <td><input type="text" name="ninzu" value="5"></td>
      </tr>
      <tr>
        <td class="text-light bg-primary">日時</td>
        <td><input type="text" name="nitiji" value="2020/8/24 10:00"></td>
      </tr>
    </table>
        <p><input type="submit" value="登録する" class="btn btn-success btn-lg"></p>
        <input type="button" value="エラー表示" onclick="alert('登録できません');">
      </form>

  </body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>
