<#include "/part/header.ftl">
<div class="container-fluid">
    <div class="table-view">
        <div class="span4">
            <#include "menu.ftl">
        </div>
        <div class="span6">
            <form role="button" method="post" action="/translation/translate">
                <input name="word" type="text" placeholder="Введите слово" />
                <button  type="submit" class="btn btn-mini">Добавить</button>
            </form>
        </div>
    </div>
</div>
<#include "/part/footer.ftl">