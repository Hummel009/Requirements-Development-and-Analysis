package hummel.servlet

import hummel.microservice.launchNotificationService
import hummel.microservice.launchReportAnalyticsService
import hummel.microservice.sender.*
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/MyServlet")
class MyServlet : HttpServlet() {
	override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
		val buttonClicked = request.getParameter("button")
		buttonClicked?.let {
			when (it) {
				"button1" -> ::launchAirlineManagementService
				"button2" -> ::launchUserManagementService
				"button3" -> ::launchBookingService
				"button4" -> ::launchPaymentService
				"button5" -> ::launchFlightManagementService
				"button6" -> ::launchNotificationService
				else -> ::launchReportAnalyticsService
			}.invoke()
		}

		request.getRequestDispatcher("index.jsp").forward(request, response)
	}
}