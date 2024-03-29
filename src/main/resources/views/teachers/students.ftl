<#ftl encoding="utf-8">

<body xmlns="http://www.w3.org/1999/html">

<ul>
    <#list students as student>
        <li>${student.id} - ${student.firstName} ${student.lastName} ${student.classroom}    <a href="/students/${student.id}/delete">x</a></li>
    </#list>
</ul>

<h2>Ajouter un étudiant</h2>

<form action="/students" method="post" class="form-example">
    <div class="form-example">
        <label for="firstname">Entrez le prénom: </label>
        <input type="text" name="firstname" id="firstname" required>
    </div>
    <div class="form-example">
        <label for="lastname">Entrez le nom: </label>
        <input type="text" name="lastname" id="lastname" required>
    </div>
    <div class="form-example">
        <label for="classroom">Entrez la classe: </label>
        <select type="text" name="classroom" id="classroom" required>
            <#list classes as class>
                <option value = "${class.classroom}">${class.classroom}</option>
            </#list>
        </select>
    </div>
    <div class="form-example">
        <input type="submit" value="Valider">
    </div>
</form>

<h2>Modifier un étudiant</h2>

<form action="/students/patch" method="post" class="form-example">
    <label for="idStudent"> ID : </label>   
    <select type="text" name="idStudent" id="idStudent" required>
        <#list students as student>
            <option value = "${student.id}">${student.id}</option>
        </#list>
    </select><br>
    <div class="form-example">
        <label for="firstname">Prénom : </label>
        <input type="text" name="firstname" id="firstname" required>
    </div>
    <div class="form-example">
        <label for="lastname">Nom : </label>
        <input type="text" name="lastname" id="lastname" required>
    </div>
    <div class="form-example">
        <label for="classroom">Classe : </label>
        <select type="text" name="classroom" id="classroom" required>
            <#list classes as class>
                <option value = "${class.classroom}">${class.classroom}</option>
            </#list>
        </select>
    </div>
    <div class="form-example">
        <input type="submit" value="Valider">
    </div>
</form>

</body>

</html>
