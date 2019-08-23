package fr.formation.financings.services;

import fr.formation.financings.entities.Financing;

public interface FinancingService {

    void create(Financing financing);

    Financing get(Long id);

    void delete(Long id);
}
