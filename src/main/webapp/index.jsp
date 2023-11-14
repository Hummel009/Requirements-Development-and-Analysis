<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Заказ билетов</title>
    <style>
		body {
			display: flex;
			align-items: center;
			justify-content: center;
			height: 100vh;
			margin: 0;
			position: relative;
			overflow: hidden;
		}

		body::before {
			content: "";
			position: absolute;
			top: 0;
			left: 0;
			width: 100%;
			height: 100%;
			background-image: url('https://media.istockphoto.com/id/155439315/photo/passenger-airplane-flying-above-clouds-during-sunset.jpg?s=612x612&w=0&k=20&c=LJWadbs3B-jSGJBVy9s0f8gZMHi2NvWFXa3VJ2lFcL0=');
			background-size: cover;
			background-position: center;
			filter: blur(5px);
		}

		body::after {
			content: "";
			position: absolute;
			top: 0;
			left: 0;
			width: 100%;
			height: 100%;
			background: rgba(0, 0, 0, 0.5);
			/* Измените последнее число (0.5) для настройки уровня затемнения */
			z-index: 0;
		}

		form {
			text-align: center;
			z-index: 1;
			text-align: center;
		}

		button {
			display: inline-block;
			padding: 7px 18px;
			border-radius: 3px;
			border-color: transparent;
			text-decoration: none;
			text-transform: uppercase;
			background: rgba(125, 73, 36, 0.5);
			color: White;
			font-weight: bold;
			cursor: pointer;
			font-size: 14px !important;
			transition: .2s !important;
		}

		button:hover {
			background: rgba(125, 73, 36, 0.9);
			color: White;
			text-shadow: none;
		}

		button * {
			margin: 0px !important;
			color: #7d4924;
		}
    </style>
</head>
<body>
<form action="MyServlet" method="get">
    <button type="submit" name="button" value="button1">AIRLINE</button>
    <button type="submit" name="button" value="button2">USERMAN</button>
    <button type="submit" name="button" value="button3">BOOKING</button>
    <button type="submit" name="button" value="button4">PAYMENT</button>
    <button type="submit" name="button" value="button5">FLIGHTS</button>
    <button type="submit" name="button" value="button6">NOTIFIC</button>
    <button type="submit" name="button" value="button7">REPORTS</button>
</form>
</body>
</html>
