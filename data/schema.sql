CREATE TABLE planta (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_surco INTEGER NOT NULL,
    especie_planta VARCHAR(100) NOT NULL,
    estado VARCHAR(100) NOT NULL,
    enferma INTEGER NOT NULL CHECK (enferma IN (0, 1)),
    fecha_plantacion DATE NOT NULL,
    fecha_ultimo_riego DATE,
    fecha_estimada_cosecha DATE,
    observaciones VARCHAR(300),
    FOREIGN KEY (id_surco) REFERENCES surco(id) ON DELETE CASCADE
);

CREATE TABLE surco (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    id_huerto INTEGER NOT NULL,
    numero INTEGER NOT NULL,
    fila INTEGER NOT NULL,
    columna INTEGER NOT NULL,
    largo INTEGER NOT NULL CHECK (largo > 0),
    ancho INTEGER NOT NULL CHECK (ancho > 0),
    UNIQUE (id_huerto, numero),
    UNIQUE (id_huerto, fila, columna),
    FOREIGN KEY (id_huerto) REFERENCES huerto(id) ON DELETE CASCADE
);

CREATE TABLE huerto (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tamanio INTEGER NOT NULL,
);

CREATE TABLE ubicacion (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    poblacion VARCHAR(50) NOT NULL,
    provincia VARCHAR(50) NOT NULL,
    latitud REAL NOT NULL,
    longitud REAL NOT NULL,
    altitud REAL NOT NULL
);