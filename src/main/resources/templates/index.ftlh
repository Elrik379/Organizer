<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Список задач</title>
    <link rel="stylesheet" type="text/css" href="/css/style.x59549.css"/>
</head>
<body>
<h1>Список задач</h1>
<h3>Добавить задачу в список</h3>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <td>
                <label> Приоритет </label>
                <input type="number" name="priorityId">
            </td>
            <td>
                <label> Описание задачи </label>
                <input type="text" name="description">
            </td>
            <td>
                <label> Дата </label>
                <input type="date" name="date">
            </td>

            <td>
                <input type="submit" value=" Добавить задачу ">
            </td>

        </tr>

    </table>
</form>
<br>
<h2>Всего задач : ${taskSize}</h2>
<table border="1px">
    <tr>
        <td>Id</td>
        <td>Приоритет</td>
        <td>Задача</td>
        <td>Дата</td>
        <td>Закрыть задачу</td>
    </tr>
    <#list taskList as task>
    <tr>
        <td>${task.id}</td>
        <td>${task.priorityId}</td>
        <td>${task.description}</td>
        <td>${task.date}</td>
        <td><a href="${'/delete/'+task.id}"">Delete</a></td>
    </tr>
</#list>
</table>
</body>
</html>