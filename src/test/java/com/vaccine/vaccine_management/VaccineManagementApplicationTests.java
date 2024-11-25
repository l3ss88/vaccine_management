package com.vaccine.vaccine_management;

import com.vaccine.vaccine_management.model.CentroVacunacion;
import com.vaccine.vaccine_management.model.CitaMedica;
import com.vaccine.vaccine_management.repository.CentroVacunacionRepository;
import com.vaccine.vaccine_management.repository.CitaMedicaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class VaccineManagementApplicationTests {

	@Autowired
	private CitaMedicaRepository citaMedicaRepository;

	@Autowired
	private CentroVacunacionRepository centroVacunacionRepository;

	@BeforeEach
	void limpiarBaseDeDatos() {
		// Limpia la base de datos antes de cada prueba
		citaMedicaRepository.deleteAll();
	}

	@Test
	void contextLoads() {
	}

	@Test
	void cargarDatosEjemploCitasMedicas() {

		// Precarga datos de ejemplo
		CitaMedica cita1 = new CitaMedica();
		cita1.setTipoVacuna("COVID-19");
		cita1.setFechaVacunacion(new Date());
		cita1.setDosis(1);
		cita1.setSede("Lima Norte");
		cita1.setEstado("Programada");

		CitaMedica cita2 = new CitaMedica();
		cita2.setTipoVacuna("Influenza");
		cita2.setFechaVacunacion(new Date());
		cita2.setDosis(2);
		cita2.setSede("Chorrillos");
		cita2.setEstado("Completada");

		CitaMedica cita3 = new CitaMedica();
		cita3.setTipoVacuna("Varicela");
		cita3.setFechaVacunacion(new Date());
		cita3.setDosis(1);
		cita3.setSede("Callao");
		cita3.setEstado("Completada");

		CitaMedica cita4 = new CitaMedica();
		cita4.setTipoVacuna("Fiebre Amarilla");
		cita4.setFechaVacunacion(new Date());
		cita4.setDosis(3);
		cita4.setSede("Miraflores");
		cita4.setEstado("Completada");

		// Guardar datos en el repositorio
		citaMedicaRepository.save(cita1);
		citaMedicaRepository.save(cita2);
		citaMedicaRepository.save(cita3);
		citaMedicaRepository.save(cita4);

		// Verificar si se han guardado correctamente
		assert citaMedicaRepository.findAll().size() == 4 : "No se guardaron todas las citas médicas";
	}

	@Test
    void RegistrarCentroVacunacion() {

		CentroVacunacion centroVacunacion = new CentroVacunacion();
		centroVacunacion.setDireccion("Av. José Pardo 796, Miraflores, Lima.");
		centroVacunacion.setNombrecentro("Centro de Salud Miraflores del MINSA");
		centroVacunacion.setTelefono("(01) 617-2730");
		centroVacunacion.setTipo_vacuna("COVID-19, influenza, hepatitis B.");
		centroVacunacion.setLatitud(-12.119142);
		centroVacunacion.setLongitud(-77.029686);

		CentroVacunacion centroVacunacion2 = new CentroVacunacion();
		centroVacunacion2.setDireccion("Av. Mariscal La Mar 1390, Miraflores, Lima.");
		centroVacunacion2.setNombrecentro("Policlínico Santa Cruz de EsSalud");
		centroVacunacion2.setTelefono("(01) 265-4800");
		centroVacunacion2.setTipo_vacuna("COVID-19, influenza, neumococo.");
		centroVacunacion2.setLatitud(-12.113784);
		centroVacunacion2.setLongitud(-77.045524);

		CentroVacunacion centroVacunacion3 = new CentroVacunacion();
		centroVacunacion3.setDireccion("Av. Caminos del Inca 257, Santiago de Surco, Lima");
		centroVacunacion3.setNombrecentro("Centro de Vacunación Internacional Biovac Perú - Surco");
		centroVacunacion3.setTelefono("(01) 637-1000");
		centroVacunacion3.setTipo_vacuna("Fiebre amarilla, tifoidea, hepatitis A y B.");
		centroVacunacion3.setLatitud(-12.121500);
		centroVacunacion3.setLongitud(-76.996800);

		CentroVacunacion centroVacunacion4 = new CentroVacunacion();
		centroVacunacion4.setDireccion("Calle Puente Grau 109, Arequipa");
		centroVacunacion4.setNombrecentro("Centro de Salud Santa Rosa - Arequipa");
		centroVacunacion4.setTelefono("(054) 234-5678");
		centroVacunacion4.setTipo_vacuna("COVID-19, influenza, hepatitis B");
		centroVacunacion4.setLatitud(-16.398803);
		centroVacunacion4.setLongitud(-71.536961);

		centroVacunacionRepository.save(centroVacunacion);
		centroVacunacionRepository.save(centroVacunacion2);
		centroVacunacionRepository.save(centroVacunacion3);
		centroVacunacionRepository.save(centroVacunacion4);



	}

}
