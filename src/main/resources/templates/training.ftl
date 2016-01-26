<#include "/part/header.ftl">
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

<#include "/part/footer.ftl">