package com.argentinaprograma.tpfinal;

import com.argentinaprograma.tpfinal.Mascota;
import com.argentinaprograma.tpfinal.Medico;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-30T13:53:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(TurnoMedico.class)
public class TurnoMedico_ { 

    public static volatile SingularAttribute<TurnoMedico, String> razonDeConsulta;
    public static volatile SingularAttribute<TurnoMedico, String> aprobado;
    public static volatile SingularAttribute<TurnoMedico, Medico> idMedico;
    public static volatile SingularAttribute<TurnoMedico, Integer> id;
    public static volatile SingularAttribute<TurnoMedico, Mascota> idMascota;
    public static volatile SingularAttribute<TurnoMedico, Date> fechaYHora;

}