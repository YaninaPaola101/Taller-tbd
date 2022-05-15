/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases 12.4.2                     */
/* Target DBMS:           PostgreSQL 11                                   */
/* Project file:          Project1.dez                                    */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database creation script                        */
/* Created on:            2022-05-15 16:06                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Add tables                                                             */
/* ---------------------------------------------------------------------- */

/* ---------------------------------------------------------------------- */
/* Add table "Disciplina"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE Disciplina (
    id_disciplina SERIAL  NOT NULL,
    nombre CHARACTER(40)  NOT NULL,
    CONSTRAINT PK_Disciplina PRIMARY KEY (id_disciplina)
);

/* ---------------------------------------------------------------------- */
/* Add table "Plan"                                                       */
/* ---------------------------------------------------------------------- */

CREATE TABLE Plan (
    id_plan SERIAL  NOT NULL,
    nombre CHARACTER(40),
    costo INTEGER,
    CONSTRAINT PK_Plan PRIMARY KEY (id_plan)
);

/* ---------------------------------------------------------------------- */
/* Add table "Disciplina_Plan"                                            */
/* ---------------------------------------------------------------------- */

CREATE TABLE Disciplina_Plan (
    id_disciplina INTEGER  NOT NULL,
    id_plan INTEGER  NOT NULL,
    CONSTRAINT PK_Disciplina_Plan PRIMARY KEY (id_disciplina, id_plan)
);

/* ---------------------------------------------------------------------- */
/* Add table "Instructor"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE Instructor (
    instructor SERIAL  NOT NULL,
    nombre CHARACTER(40)  NOT NULL,
    CONSTRAINT PK_Instructor PRIMARY KEY (instructor)
);

/* ---------------------------------------------------------------------- */
/* Add table "Instructor_Disciplina"                                      */
/* ---------------------------------------------------------------------- */

CREATE TABLE Instructor_Disciplina (
    instructor INTEGER  NOT NULL,
    id_disciplina INTEGER  NOT NULL,
    CONSTRAINT PK_Instructor_Disciplina PRIMARY KEY (instructor, id_disciplina)
);

/* ---------------------------------------------------------------------- */
/* Add table "Sucursal"                                                   */
/* ---------------------------------------------------------------------- */

CREATE TABLE Sucursal (
    id_sucursal SERIAL  NOT NULL,
    direccion TEXT,
    CONSTRAINT PK_Sucursal PRIMARY KEY (id_sucursal)
);

/* ---------------------------------------------------------------------- */
/* Add table "Usuario"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE Usuario (
    id_usuario SERIAL  NOT NULL,
    nombre TEXT  NOT NULL,
    contrasenia TEXT  NOT NULL,
    edad INTEGER,
    activo BOOLEAN,
    CONSTRAINT PK_Usuario PRIMARY KEY (id_usuario)
);

/* ---------------------------------------------------------------------- */
/* Add table "Sesion"                                                     */
/* ---------------------------------------------------------------------- */

CREATE TABLE Sesion (
    id_sesion SERIAL  NOT NULL,
    IP TEXT  NOT NULL,
    PID TEXT  NOT NULL,
    CONSTRAINT PK_Sesion PRIMARY KEY (id_sesion)
);

/* ---------------------------------------------------------------------- */
/* Add table "Rol"                                                        */
/* ---------------------------------------------------------------------- */

CREATE TABLE Rol (
    id_rol SERIAL  NOT NULL,
    nombre TEXT  NOT NULL,
    CONSTRAINT PK_Rol PRIMARY KEY (id_rol)
);

/* ---------------------------------------------------------------------- */
/* Add table "Funcion"                                                    */
/* ---------------------------------------------------------------------- */

CREATE TABLE Funcion (
    id_funcion SERIAL  NOT NULL,
    nombre TEXT  NOT NULL,
    CONSTRAINT PK_Funcion PRIMARY KEY (id_funcion)
);

/* ---------------------------------------------------------------------- */
/* Add table "Usuario_Rol"                                                */
/* ---------------------------------------------------------------------- */



CREATE TABLE Usuario_Rol (
    activo BOOLEAN  NOT NULL,
    fecha_desde DATE,
    fecha_hasta DATE,
    id_usuario INTEGER,
    id_rol INTEGER
);



/* ---------------------------------------------------------------------- */
/* Add table "Rol_Funcion"                                                */
/* ---------------------------------------------------------------------- */

CREATE TABLE Rol_Funcion (
    activo BOOLEAN  NOT NULL,
    fecha_desde DATE  NOT NULL,
    fecha_hasta DATE  NOT NULL,
    id_rol INTEGER,
    id_funcion INTEGER
);

/* ---------------------------------------------------------------------- */
/* Add table "IU"                                                         */
/* ---------------------------------------------------------------------- */

CREATE TABLE IU (
    id_iu SERIAL  NOT NULL,
    nombre TEXT  NOT NULL,
    CONSTRAINT PK_IU PRIMARY KEY (id_iu)
);

/* ---------------------------------------------------------------------- */
/* Add table "Funcion_IU"                                                 */
/* ---------------------------------------------------------------------- */

CREATE TABLE Funcion_IU (
    activo BOOLEAN  NOT NULL,
    fecha_desde TEXT  NOT NULL,
    fecha_hasta TEXT  NOT NULL,
    id_funcion INTEGER,
    id_iu INTEGER
);

/* ---------------------------------------------------------------------- */
/* Add table "Suscripcion"                                                */
/* ---------------------------------------------------------------------- */



CREATE TABLE Suscripcion (
    id_inscripcion SERIAL  NOT NULL,
    fecha DATE,
    id_plan INTEGER,
    id_sucursal INTEGER,
    id_usuario INTEGER,
    CONSTRAINT PK_Suscripcion PRIMARY KEY (id_inscripcion)
);



/* ---------------------------------------------------------------------- */
/* Add table "Clase"                                                      */
/* ---------------------------------------------------------------------- */



CREATE TABLE Clase (
    id_horario SERIAL  NOT NULL,
    hora_inicio DATE  NOT NULL,
    hora_fin DATE  NOT NULL,
    instructor INTEGER,
    id_disciplina INTEGER,
    CONSTRAINT PK_Clase PRIMARY KEY (id_horario)
);



/* ---------------------------------------------------------------------- */
/* Add foreign key constraints                                            */
/* ---------------------------------------------------------------------- */

ALTER TABLE Suscripcion ADD CONSTRAINT Plan_Suscripcion 
    FOREIGN KEY (id_plan) REFERENCES Plan (id_plan);

ALTER TABLE Suscripcion ADD CONSTRAINT Sucursal_Suscripcion 
    FOREIGN KEY (id_sucursal) REFERENCES Sucursal (id_sucursal);

ALTER TABLE Suscripcion ADD CONSTRAINT Usuario_Suscripcion 
    FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario);

ALTER TABLE Disciplina_Plan ADD CONSTRAINT Disciplina_Disciplina_Plan 
    FOREIGN KEY (id_disciplina) REFERENCES Disciplina (id_disciplina);

ALTER TABLE Disciplina_Plan ADD CONSTRAINT Plan_Disciplina_Plan 
    FOREIGN KEY (id_plan) REFERENCES Plan (id_plan);

ALTER TABLE Clase ADD CONSTRAINT Instructor_Clase 
    FOREIGN KEY (instructor) REFERENCES Instructor (instructor);

ALTER TABLE Clase ADD CONSTRAINT Disciplina_Clase 
    FOREIGN KEY (id_disciplina) REFERENCES Disciplina (id_disciplina);

ALTER TABLE Instructor_Disciplina ADD CONSTRAINT Instructor_Instructor_Disciplina 
    FOREIGN KEY (instructor) REFERENCES Instructor (instructor);

ALTER TABLE Instructor_Disciplina ADD CONSTRAINT Disciplina_Instructor_Disciplina 
    FOREIGN KEY (id_disciplina) REFERENCES Disciplina (id_disciplina);

ALTER TABLE Usuario_Rol ADD CONSTRAINT Usuario_Usuario_Rol 
    FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario);

ALTER TABLE Usuario_Rol ADD CONSTRAINT Rol_Usuario_Rol 
    FOREIGN KEY (id_rol) REFERENCES Rol (id_rol);

ALTER TABLE Rol_Funcion ADD CONSTRAINT Rol_Rol_Funcion 
    FOREIGN KEY (id_rol) REFERENCES Rol (id_rol);

ALTER TABLE Rol_Funcion ADD CONSTRAINT Funcion_Rol_Funcion 
    FOREIGN KEY (id_funcion) REFERENCES Funcion (id_funcion);

ALTER TABLE Funcion_IU ADD CONSTRAINT Funcion_Funcion_IU 
    FOREIGN KEY (id_funcion) REFERENCES Funcion (id_funcion);

ALTER TABLE Funcion_IU ADD CONSTRAINT IU_Funcion_IU 
    FOREIGN KEY (id_iu) REFERENCES IU (id_iu);
