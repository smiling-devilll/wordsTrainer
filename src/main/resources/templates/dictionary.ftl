<#include "/part/header.ftl">
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

<#include "/part/footer.ftl">