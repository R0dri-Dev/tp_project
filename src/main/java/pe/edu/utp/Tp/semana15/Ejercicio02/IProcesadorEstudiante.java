package pe.edu.utp.Tp.semana15.Ejercicio02;

public interface IProcesadorEstudiante {
   /**
         * Procedimiento: procesa los datos de un estudiante y retorna un resultado como String.
         * @param nombre Nombre del estudiante.
         * @param datos Datos numéricos del estudiante (por ejemplo, notas).
         * @return Resultado procesado en formato String.
         */
        String procesarDatos(String nombre, double... datos); // Función

        /**
         * Procedimiento: muestra el resultado procesado.
         * @param resultado Resultado a mostrar.
         */
        void mostrarResultado(String resultado); // Procedimiento
}
