package edu.eci.arsw.blueprints.persistence;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface Filter {

    public Blueprint filtro(Blueprint bp);
}