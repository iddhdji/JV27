<HTML>
<HEAD>
<TITLE>名簿登録</TITLE>
<META HTTP-EQUIV="content-type" CONTENT="text/html;charset=UTF-8">
</HEAD>
<BODY BGCOLOR="#FFFFFF"> 
class_insert.html
<CENTER>
<CAPTION><FONT SIZE="+3" COLOR="#0000FF">
<B>＜ ＜ 名簿登録 ＞ ＞</B>
</FONT></CAPTION>
<BR><BR>
<BR>
<FORM METHOD="POST" ACTION="./servlet/class_insert">
<HR SIZE="5" WIDTH="80%">
<CENTER>
<TABLE BORDER="2"  bordercolor="darkblue">
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">クラス</FONT></TD>
<td>
<select name="CLASS_NO" size="1">
<option value="AT11A192" selected>AT11A192
<option value="AT11B203">AT11B203
<option value="CG11A172">CG11A172
<option value="IT11A172">IT11A172
<option value="AT12A165">AT12A165
<option value="AT12B165">AT12B165
<option value="IH12A101">IH12A101
<option value="IW12A185">IW12A185
<option value="AT13A181">AT13A181
<option value="AP13A223">AP13A223
<option value="IH13A181">IH13A181
<option value="IW13A187">IW13A187
<option value="CD13A166">CD13A166
<option value="AP14A226">AP14A226
<option value="AT14A226">AT14A226
<option value="IH14A223">IH14A223
<option value="CT14A187">CT14A187
<option value="IW14A187">IW14A187
<option value="xx14Axxx">xx14Axxx
</select>
</td>
</TR>
<TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">出席</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="SYUSSEKI_NO" SIZE="5" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">学籍</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="GAKUSEKI_NO" SIZE="5" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">氏名（姓）</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="SIMEI_1" SIZE="30" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">氏名（名）</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="SIMEI_2" SIZE="30" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">カナ（姓）</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="KANA_1" SIZE="30" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">カナ（名）</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="KANA_2" SIZE="30" VALUE=""></TD>
</TR>
<TR>
<TD BGCOLOR="darkblue"><FONT COLOR="white">生年月日</FONT></TD>
<TD><INPUT TYPE="TEXT" NAME="UMARE" SIZE="30" VALUE=""></TD>
</TR>
</TABLE>
<P>
<HR SIZE="5" WIDTH="80%">
<BR><CENTER>
<INPUT TYPE="submit" VALUE="登録">
<INPUT TYPE="RESET" VALUE="入力クリア"><BR><BR>
</FORM>
<HR>
<A HREF="class_index.html">メニューヘ戻る</A>
<BR>
</CENTER>
</BODY>
</HTML>

