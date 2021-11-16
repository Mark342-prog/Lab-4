public class c implements productividad,radio,reproductor,telefono {
    boolean on = false;
    int volume = 0;
    boolean tfc = false;

    @Override
    public void apagar_ecender() {
        if (on == false ) {
            on = true;
        }
        else{
            on = false;
        }
        
    }
    @Override
    public void volumenM() {
        if (volume > -1 ) {
            volume -= 1;
        } else {
            
        }
        
    }

    @Override
    public void volumenP() {
        if (volume > -1 ) {
            volume += +1;
        } else {
            
        }
        
    }


    @Override
    public void conect_disconect() {
        if (tfc == false) {
            tfc = true;
        } else {
            tfc = false;
        }
        
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void colgar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changeS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void call_last() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void change_last() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void select() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void change() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void now() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void frecuencia() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void estaciones() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void emisoras() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void plan() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void targets() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void weather() {
        // TODO Auto-generated method stub
        
    }

}
