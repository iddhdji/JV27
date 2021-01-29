<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>注文受付</title>
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

<h1 class="text-primary font-weight-bold">注文受付</h1>





       <div class="sidebar-sticky">
         <ul class="nav flex-column">
          <li class="nav-item"><a class="nav-link active" href="#">メニュー</a></li>
          <li class="nav-item"><a class="nav-link" href="tyumon_uketuke.jsp">料理</a></li>
          <li class="nav-item"><a class="nav-link" href="tyumon_snakku.jsp">スナック</a></li>
          <li class="nav-item"><a class="nav-link" href="tyumon_desert.jsp">デザート</a></li>
          <li class="nav-item"><a class="nav-link" href="tyumon_drink.jsp">ドリンク</a></li>
       </ul>
</div>
     
<h2 class="text-primary font-weight-bold">料理</h1>

     <form action="tyumon_henkou.jsp" method="get">
  <p><input type="submit" value="変更する" class="btn btn-success btn-lg"></p>
  </form>
       <form action="tyumon_sakujo.jsp" method="get">
  <p><input type="submit" value="削除する" class="btn btn-danger btn-lg"></p>
  </form>

<form action="tyumon_kakunin.jsp" method="get">

<<table class="table">
  <tr>
    <td><input type="image" name="2" src="image/yakisoba.jpg">350円</td>
    <td><input type="image" name="2" src="image/yakisoba.jpg">350円</td>
  </tr>
  <tr>
    <td><input type="image" name="2" src="image/yakisoba.jpg">350円</td>
    <td><input type="image" name="2" src="image/yakisoba.jpg">350円</td>
  </tr>
</table>
</form>

     <form action="tyumon_rireki.jsp" method="get">
  <p><input type="submit" value="履歴" class="btn btn-success btn-lg"></p>
  </form>
       <form action="tyumon_kanri.jsp" method="get">
  <p><input type="submit" value="管理" class="btn btn-success btn-lg"></p>
  </form>

  </body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

</html>
