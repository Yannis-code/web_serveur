<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list gommettes as gommette>
        <li>${gommette.id} - ${gommette.name} /  ${gommette.desc}  / gommette ${gommette.color} </li>
    </#list>
</ul>

<h1>Créer une gommette</h1>
<form action="/gommettes" method="post" class="form-example">
        <div class="form-example">
                <label for="name">Entrez le nom: </label>
                <input type="text" name="name" id="name" required>
        </div>
        <div class="form-example">
                <label for="description">Entrez la description: </label>
                <input type="text" name="description" id="description" required>
        </div>
        <div class="form-example">
                <label for="color">Entrez la couleur: </label>
                <input type="text" name="color" id="color" required>
        </div>
        <div class="form-example">
                <input type="submit" value="Valider">
        </div>
</form>

</body>

</html>
