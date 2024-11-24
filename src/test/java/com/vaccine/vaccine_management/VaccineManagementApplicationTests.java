package com.vaccine.vaccine_management;

import com.vaccine.vaccine_management.model.CitaMedica;
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
}
