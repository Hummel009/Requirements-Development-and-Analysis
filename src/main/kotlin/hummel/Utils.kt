package hummel

import java.sql.Connection

const val url: String = "jdbc:mysql://localhost:3306/mydb"
const val user: String = "root"
const val password: String = "amogus134"

fun addSampleValue(connection: Connection, tableName: String, sampleValue: Int) {
	val query = "INSERT INTO $tableName (${tableName.substring(0, tableName.length - 1)}) VALUES (?)"
	connection.prepareStatement(query).use {
		it.setInt(1, sampleValue)
		it.executeUpdate()
	}
}