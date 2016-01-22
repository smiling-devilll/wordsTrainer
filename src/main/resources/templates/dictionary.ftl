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
            <p>Словарь:</p>
            <#list words as word>
                <p>${word.toString()}</p>
            </#list>
        </td>
    </tr>
</table>

</html>
<#include "/part/footer.ftl">