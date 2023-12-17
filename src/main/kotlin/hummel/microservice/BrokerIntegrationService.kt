package hummel.microservice

import hummel.microservice.sender.*
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@SuppressWarnings("SpringMVCViewInspection")
class MyServlet {
	@RequestMapping("/launchService")
	fun launchService(request: HttpServletRequest, response: HttpServletResponse) {
		val buttonClicked = request.getParameter("button")
		buttonClicked?.let {
			when (it) {
				"airline" -> launchAirlineManagementService()
				"userman" -> launchUserManagementService()
				"booking" -> launchBookingService()
				"payment" -> launchPaymentService()
				"flights" -> launchFlightManagementService()
				"notific" -> launchNotificationService()
				"reports" -> launchReportAnalyticsService()
			}
		}
		request.getRequestDispatcher("index.jsp").forward(request, response)
	}
}