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
        <#list wordsForTraining as word>
            <p>

            <div>
                <button class="btn" name="wrd">${word.getWord().getOriginal()}</button>
                <p>${word.getWord().getTranslation()}</p>
            </div>

            <form action="training2" method="post">
                <div class="btn-group" name="name">
                    <#list word.getVariants() as variant>
                        <button class="btn-default" name="answer" value=${variant}>${variant.getTranslation()}</button>
                    </#list>
                </div>
            </form>
            </p>
        </#list>

        <#--<button class="btn">${variant.getTranslation()}</button>-->
        </td>
    </tr>
</table>

</html>
<#include "/part/footer.ftl">