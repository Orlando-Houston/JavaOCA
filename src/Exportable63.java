interface Exportable63 {
    void export();
}
class Tool63  implements Exportable63 {
    public void export(){                         //line n1
        System.out.println ("Tool: :export");
    }

}
class ReportTool63 extends Tool63 {

   public    void export(){   //line2
     //  void exprot(){}  originaly
        System.out.println ("RTool: : export");
    }
    public static void main(String[] args) {

        Tool63 aTool=new ReportTool63 ();

        Tool63 bTool=new Tool63 ();
        callExport(aTool);
        callExport(bTool);

    }

    public static void callExport(Exportable63 ex) {
        ex.export();

    }
}
// comp fail line n2



