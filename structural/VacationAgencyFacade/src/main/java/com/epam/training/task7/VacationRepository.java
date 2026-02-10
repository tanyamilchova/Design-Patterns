package com.epam.training.task7;

public class VacationRepository {
    private final Configuration configuration;
    private final ConnectionProvider connectionProvider;

    public VacationRepository(Configuration configuration, ConnectionProvider connectionProvider){
        this.configuration = configuration;
        this.connectionProvider = connectionProvider;
    }

    public void addVacation(int employeeId, int duration) {
        String query = "INSERT INTO Vacations (employee_id, duration, is_active) VALUES(?, ?, 1)";
        execute(query, employeeId , duration);
    }

    public void markAsArrived(int employeeId) {
        String query = "UPDATE Vacations SET is_active = 0 WHERE employee_id = ?";
        execute(query, employeeId);
    }

    private void execute(String query, Object... params) {
        String connectionString = configuration.getConnectionString();

        try (Connection connection = connectionProvider.createConnection(connectionString);
             Command command = connection.createCommand()) {

            command.executeQuery(query, params);

        } catch (Exception e) {
            throw new DatabaseException("Error executing query", e);
        }
    }

}
