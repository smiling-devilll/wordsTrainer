<#include "/part/header.ftl">
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<table>
    <tr>
        <td>
        <#include "menu.ftl">
        </td>

        <td>
            <form role="button" method="post" action="/translation/translate">
                <input name="word" type="text" placeholder="Введите слово" />
                <button  type="submit" class="btn btn-default">Добавить</button>
            </form>
        </td>
    </tr>
</table>

</html>
<#include "/part/footer.ftl">