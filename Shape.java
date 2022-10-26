 abstract class Shapes {
        abstract void draw();
    }



    class line extends Shapes {



        @Override
        public void draw() {



            System.out.println("drawing line...");
        }
    }



    class cube extends Shapes {



        @Override
        public void draw() {



            System.out.println("drawing cube...");
        }
    }



    class rectangle extends Shapes {



        @Override
        public void draw() {



            System.out.println("drawing recctangle...");
        }
    }



    class Shape {
        public void main(String args[]) {



            cube c = new cube();
            c.draw();
            line l = new line();
            l.draw();



        }
    }

