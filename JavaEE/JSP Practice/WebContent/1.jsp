<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<% request.setCharacterEncoding("gb2312");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>注册</title>
</head>
<body>
<h3 align="center">用户注册</h3>
<table border="0" align="center" cellpadding="0">
  <tr>
    <td>用户名：</td>
    <td><form id="form1" name="form1" method="post" action="">
      <input type="text" name="textfield" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>密码：</td>
    <td><form id="form2" name="form2" method="post" action="">
      <input type="password" name="textfield2" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>确认密码：</td>
    <td><form id="form3" name="form3" method="post" action="">
      <input type="password" name="textfield22" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>用户真实姓名：</td>
    <td><form id="form1" name="form1" method="post" action="">
      <input type="text" name="textfield222" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>出生日期：</td>
    <td><form id="form4" name="form4" method="post" action="">
      <select name="select">
        <option>1990</option>
        <option>1991</option>
        <option>1992</option>
        <option>1993</option>
        <option>1994</option>
        <option>1995</option>
        <option>1996</option>
        <option>1997</option>
        <option>1998</option>
        <option>1999</option>
        <option>2000</option>
      </select>
    年
    <select name="select2">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
      <option>11</option>
      <option>12</option>
    </select>
    月
    <select name="select3">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
      <option>11</option>
      <option>12</option>
      <option>13</option>
      <option>14</option>
      <option>15</option>
      <option>16</option>
      <option>17</option>
      <option>18</option>
      <option>19</option>
      <option>20</option>
      <option>21</option>
      <option>22</option>
      <option>23</option>
      <option>34</option>
      <option>25</option>
      <option>26</option>
      <option>27</option>
      <option>28</option>
      <option>29</option>
      <option>30</option>
      <option>31</option>
    </select>
    日
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>用户性别：</td>
    <td><form id="form5" name="form5" method="post" action="">
      <input name="radiobutton" type="radio" value="radiobutton" checked="checked" />
      男 
      <input type="radio" name="radiobutton" value="radiobutton" />
      女
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>用户地址：</td>
    <td><form id="form6" name="form6" method="post" action="">
      <input type="text" name="textfield3" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>邮箱：</td>
    <td><form id="form7" name="form7" method="post" action="">
      <input type="text" name="textfield4" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>手机：</td>
    <td><form id="form8" name="form8" method="post" action="">
      <input type="text" name="textfield5" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="46">用户类别：</td>
    <td><form id="form9" name="form9" method="post" action="">
      <p>
        <label>
          <input name="RadioGroup1" type="radio" value="单选" checked="checked" />
          普通用户</label>
         <label>
         <input type="radio" name="RadioGroup1" value="单选" />
协作用户</label>
         <label>
         <input type="radio" name="RadioGroup1" value="单选" />
管理员</label>
         <br />
        <label></label>
        <br />
        <label></label>
        </p>
      </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2">*如果是协作企业请补充以下信息</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>企业名：</td>
    <td><form id="form11" name="form11" method="post" action="">
      <input type="text" name="textfield6" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>企业法人：</td>
    <td><form id="form12" name="form12" method="post" action="">
      <input type="text" name="textfield7" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>企业编号:</td>
    <td><form id="form10" name="form10" method="post" action="">
      <input type="text" name="textfield8" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>企业资源：</td>
    <td><textarea name="textarea"></textarea></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>企业剩余资源：</td>
    <td><textarea name="textarea2"></textarea></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3"><div align="center">
      <input type="submit" name="Submit" value="提交" />
    </div></td>
  </tr>
</table>
<p>&nbsp;</p>
</body>
</html>
