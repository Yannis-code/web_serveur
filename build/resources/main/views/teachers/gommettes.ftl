<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<h1>Liste des gommettes configurées</h1>

<ul>
    <#list gommettes as gommette>
        <li>
                ${gommette.id} - ${gommette.name} /  ${gommette.desc}  / gommette ${gommette.color}               <a href="/gommettes/${gommette.id}/delete">x</a>
        </li>
    </#list>
</ul>

<h2>Créer une gommette</h2>

<form action="/gommettes-teacher" method="post" class="form-example">
        <label for="name">Entrez le nom: </label>
        <input type="text" name="name" id="name" required>

        <label for="description">Entrez la description: </label>
        <input type="text" name="description" id="description" required>
        
        <label for="color">Entrez la couleur: </label>
        <select type="text" name="color" id="color" required>
                <option value = "Blanche">Blanche</option>
                <option value = "Verte">Verte</option>
                <option value = "Rouge">Rouge</option>
        </select>
        
        <input type="submit" value="Valider">
</form>

<h2>Modifier une gommette</h2>

<form action="/gommettes-teacher/patch" method="post" class="form-example">
        <label for="id"> ID: </label>
        <select type="text" name="id" id="id" required>
            <#list gommettes as gommette>
                <option value = "${gommette.id}">${gommette.id} </option>
            </#list>
        </select>

        <label for="name">Entrez le nom: </label>
        <input type="text" name="name" id="name" required>

        <label for="description">Entrez la description: </label>
        <input type="text" name="description" id="description" required>

        <label for="color">Entrez la couleur: </label>
        <select type="text" name="color" id="color" required>
                <option value = "Blanche">Blanche</option>
                <option value = "Verte">Verte</option>
                <option value = "Rouge">Rouge</option>
        </select>

        <input type="submit" value="Valider">

</form>

</body>

</html>
