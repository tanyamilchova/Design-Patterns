package com.epam.training.task7;

public class VacationAgencyFacade {
    private final VacationService vacationService;

    public VacationAgencyFacade(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    public  void bookVacation( int employeeId, int duration) {
        vacationService.add( employeeId, duration);
        vacationService.markAsArrived(employeeId);
    }
}
