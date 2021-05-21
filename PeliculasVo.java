package com.devevp.fragments.PeliculasVo;

import java.io.Serializable;

public class PeliculasVo implements Serializable {

        private String nombre;
        private String info;
        private String sinopsis;
        private int imagenId;


        public PeliculasVo(String nombre, String info, String sinopsis, int imagenId) {
            this.nombre = nombre;
            this.info = info;
            this.sinopsis = sinopsis;
            this.imagenId = imagenId;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getSinopsis() {
        return sinopsis;
        }

        public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public int getImagenId() {
            return imagenId;
        }

        public void setImagenId(int imagenId) {
            this.imagenId = imagenId;
        }
    }
