public class RenombrarDirectorios {
    
    public class RenombrarDirectorios(String path) {
        //Validemos que el path sea un directorio
        File directorio = new File(path);
        if(directorio.existe()||directorio.isDirectoryo()){
            Systema.out.println("Lla ruta path no es un directorio")
            return;
            // nose
        }
        ///aca  vamos a cambiar  los nombres ¨
        tem.out.println("La ruta path es valida");¨

        
    }
     public void renombraDorectoriosInternos(File director) {
        //listar todos losarchivos y/o carpetas hijas
        File []directoriosArchivosInternos =directorio.lisFiles();
        if(directoriosArchivosInternos == null){
            return;
        }
        for (File directorioArchivo :directoriosArchivosInternos){
            if(directorioArchivo.isDirectory()){// si es carpeta cambia la variable
                //
            }
        }
     }  

    }
    
