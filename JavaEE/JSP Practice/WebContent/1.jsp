<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<% request.setCharacterEncoding("gb2312");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>ע��</title>
</head>
<body>
<h3 align="center">�û�ע��</h3>
<table border="0" align="center" cellpadding="0">
  <tr>
    <td>�û�����</td>
    <td><form id="form1" name="form1" method="post" action="">
      <input type="text" name="textfield" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>���룺</td>
    <td><form id="form2" name="form2" method="post" action="">
      <input type="password" name="textfield2" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>ȷ�����룺</td>
    <td><form id="form3" name="form3" method="post" action="">
      <input type="password" name="textfield22" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>�û���ʵ������</td>
    <td><form id="form1" name="form1" method="post" action="">
      <input type="text" name="textfield222" />
    </form></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>�������ڣ�</td>
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
    ��
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
    ��
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
    ��
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>�û��Ա�</td>
    <td><form id="form5" name="form5" method="post" action="">
      <input name="radiobutton" type="radio" value="radiobutton" checked="checked" />
      �� 
      <input type="radio" name="radiobutton" value="radiobutton" />
      Ů
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>�û���ַ��</td>
    <td><form id="form6" name="form6" method="post" action="">
      <input type="text" name="textfield3" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>���䣺</td>
    <td><form id="form7" name="form7" method="post" action="">
      <input type="text" name="textfield4" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>�ֻ���</td>
    <td><form id="form8" name="form8" method="post" action="">
      <input type="text" name="textfield5" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="46">�û����</td>
    <td><form id="form9" name="form9" method="post" action="">
      <p>
        <label>
          <input name="RadioGroup1" type="radio" value="��ѡ" checked="checked" />
          ��ͨ�û�</label>
         <label>
         <input type="radio" name="RadioGroup1" value="��ѡ" />
Э���û�</label>
         <label>
         <input type="radio" name="RadioGroup1" value="��ѡ" />
����Ա</label>
         <br />
        <label></label>
        <br />
        <label></label>
        </p>
      </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="2">*�����Э����ҵ�벹��������Ϣ</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>��ҵ����</td>
    <td><form id="form11" name="form11" method="post" action="">
      <input type="text" name="textfield6" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>��ҵ���ˣ�</td>
    <td><form id="form12" name="form12" method="post" action="">
      <input type="text" name="textfield7" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>��ҵ���:</td>
    <td><form id="form10" name="form10" method="post" action="">
      <input type="text" name="textfield8" />
    </form>    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>��ҵ��Դ��</td>
    <td><textarea name="textarea"></textarea></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>��ҵʣ����Դ��</td>
    <td><textarea name="textarea2"></textarea></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3"><div align="center">
      <input type="submit" name="Submit" value="�ύ" />
    </div></td>
  </tr>
</table>
<p>&nbsp;</p>
</body>
</html>
