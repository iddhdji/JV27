function zip_write(){
// パラメータセット
   $("iparam").value = "write";

// フォームの入力データをＵＲＬパラメータに変換
   sendData = Form.serialize("inputForm");
   alert(sendData);

// 送信先ＵＲＬの指定
   sendURL = "/JV27/servlet/zip";

// データ送信

   new Ajax.Request(sendURL,{ method:"post",parameters:sendData,onComplete:write_end,onException:write_err });
}

function write_end(httpObj){
  alert("cookie書き込み完了！");
}

function write_err(httpObj,err_msg){
  alert("cookie書き込み失敗！" + err_msg);
}

function zip_read(){
// パラメータセット
   $("iparam").value = "read";
   
// フォームの入力データをＵＲＬパラメータに変換
   sendData = Form.serialize("inputForm");

// 送信先ＵＲＬの指定
   sendURL = "/JV27/servlet/zip";
          
// データ送信
   new Ajax.Request(sendURL,{ method:"post",parameters:sendData,onComplete:read_end,onException:read_err });
}


function read_end(httpObj){
   var edit_csv =  httpObj.responseText;
   var edit_data = new Array();
   edit_data = edit_csv.split(",");
   $("izip_address").value   = edit_data[0];

   
// innerHTML処理
//   target.innerHTML = "<img src='./image/bung1.png' height='64px' width='64px' /><input type='text' id='ikazu' name='kazu' size='10' value='5'><input type='button' value='＋' onclick='tasu()'><input type='button' value='ー' onclick='hiku()'>"
   
}

function read_err(httpObj,err_msg){
  alert("cookie読み込み失敗！" + err_msg);
}

function testdata(){
  $("inamae").value    = "山田　太郎";
  $("otoko").checked = true;
  $("ie_mail").value    = "yamada@hal.ac.jp";
  $("isitumon").value   = "パンダ";
}
function tasu(){
  $("ikazu").value    =  Number($("ikazu").value) + 1;
}
function hiku(){
  $("ikazu").value    =  Number($("ikazu").value) - 1;
}