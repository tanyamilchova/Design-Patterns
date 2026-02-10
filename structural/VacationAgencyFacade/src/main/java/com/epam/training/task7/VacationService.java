package com.epam.training.task7;

public class VacationService {

    private final VacationRepository vacationRepository;
    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public void add(int employeeId, int duration) {
        vacationRepository.addVacation(employeeId, duration);
    }

    public void markAsArrived(int employeeId) {
        vacationRepository.markAsArrived(employeeId);
    }
}