/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AtaReunioesDAO;
import dao.AtaReunioesPresentesDAO;
import dao.AtividadesDAO;
import dao.CampusDAO;
import dao.ComissoesDAO;
import dao.CursoDAO;
import dao.DisciplinaDAO;
import dao.OfertaDisciplinaCursoDAO;
import dao.OrientacoesDAO;
import dao.ServidorDAO;
import dao.ServidoresComissoesDAO;
import extra.Espaco;
import java.util.Scanner;
import model.Atividades;
import model.Campus;
import model.Servidor;
import model.Curso;
import model.Disciplina;
import model.AtaReunioes;
import model.Comissoes;
import model.Orientacoes;

/**
 *
 * @author Lindovaldo
 */

public class UserComum {
    
    GUI gui;
    Espaco espaco;
    CampusDAO campusDao;
    ServidorDAO servidorDao;
    CursoDAO cursoDao;
    DisciplinaDAO disciplinaDao;
    OfertaDisciplinaCursoDAO ofertaDao;
    OrientacoesDAO orientacoesDao;
    AtividadesDAO atividadesDao;
    ComissoesDAO comissaoDao;
    ServidoresComissoesDAO servidorComissaoDao;
    AtaReunioesDAO ataReuniaoDao;
    AtaReunioesPresentesDAO ataReuniaoPresentesDao;
    
    Scanner s = new Scanner(System.in);

    public UserComum(CampusDAO campusdao, ServidorDAO servidordao, CursoDAO cursodao, DisciplinaDAO disciplinadao,
                     OfertaDisciplinaCursoDAO ofertadao, OrientacoesDAO orientacoesdao, AtividadesDAO atividadesdao,
                     ComissoesDAO comissoesdao, ServidoresComissoesDAO servidorComissaodao, AtaReunioesDAO atareunioesdao,
                     AtaReunioesPresentesDAO ataReunioesPresentesdao, GUI gui, Espaco espaco){
        
        this.gui = gui;
        this.campusDao = campusdao;
        this.servidorDao = servidordao;
        this.cursoDao = cursodao;
        this.disciplinaDao = disciplinadao;
        this.ofertaDao = ofertadao;
        this.orientacoesDao = orientacoesdao;
        this.atividadesDao = atividadesdao;
        this.comissaoDao = comissoesdao;
        this.servidorComissaoDao =servidorComissaodao;
        this.ataReuniaoDao = atareunioesdao;
        this.ataReuniaoPresentesDao= ataReunioesPresentesdao;
        this.espaco = espaco;
        
        this.menu();
    }
    

    
    public void menu() {
        
        int escolha; 
        espaco.darEspaco();

        do {
            escolha = gui.escolha();
            switch(escolha) {

                case 1:
                    espaco.darEspaco();
                    subMenuCampus(campusDao);
                    break;

                case 2:
                    espaco.darEspaco();
                    subMenuServidor(servidorDao);
                    break;
                
                case 3:
                    espaco.darEspaco();
                    subMenuCurso(cursoDao);
                    break;
                
                case 4:
                    espaco.darEspaco();
                    subMenuDisciplina(disciplinaDao);
                    break;
                
                case 5:
                    espaco.darEspaco();
                    subMenuOferta(ofertaDao);
                    break;
                
                case 6:
                    espaco.darEspaco();
                    subMenuOrientacao(orientacoesDao);
                    break;
                
                case 7:
                    espaco.darEspaco();
                    subMenuAtividade(atividadesDao);
                    break;

                case 8:
                    espaco.darEspaco();
                    subMenuComissao(comissaoDao);
                    break;
                
                case 9:
                    espaco.darEspaco();
                    subMenuServidorComissao(servidorComissaoDao);
                    break;
                
                case 10:
                    espaco.darEspaco();
                    subMenuAtaReuniao(ataReuniaoDao);
                    break;
                
                case 11:
                    espaco.darEspaco();
                    subMenuAtaReuniaoPresentes(ataReuniaoPresentesDao);
                    break;   
                   
                case 12:
                    espaco.darEspaco();
                    
                    System.out.println("\t\tRelatorio Atas das Reuniões\n\n");
                    
                    System.out.print("\tInforme o nome da comissao: ");
//                    Comissao comissao = ComissaoDAO.busca(s.nextLine());
                    
                    System.out.print("\tInforme a data de inicio para filtrar: ");
//                    LocalDate inicio = LocalDate.parse(s.nextLine(), fmt);
                    
                    System.out.print("\tInforme a data de fim para filtrar: ");
//                    LocalDate fim = LocalDate.parse(s.nextLine(), fmt);
                    
//                    System.out.println((ataReuniaoDao.relatorioPeriodo(comissao, inicio, fim) != null) ? ataReuniaoDao.relatorioPeriodo(comissao, inicio, fim) : "Não tem nenhuma informação para gerar um relatorio"); 
                    break;
                
                    
                case 13:
                    espaco.darEspaco();
                    System.out.println("\t\t Relatorio das Informações de Aulas\n\n");
                    
                    System.out.print("\tInforme o nome do campus: ");
//                    Campus campus = CampusDAO.busca(s.nextLine());
                    
//                    System.out.println((ofertaDao.relatorioInfoAulas(campus) != null) ? ofertaDao.relatorioInfoAulas(campus) : "Não tem nenhuma informação para gerar um relatorio"); 
                    break;
                    
                case 14:
                    espaco.darEspaco();
                    StringBuilder rel = new StringBuilder();                                        
//                    Servidor serv = new Servidor();
                    int cont = 0;

//                    do {
                        System.out.println("Informe o nome do Servidor: ");
//                        serv = ServidorDAO.busca(s.nextLine());
//                    } while(serv == null);
                    
//                    Oferta oferta[] = new Oferta[10];
//                    for(int i = 0; i < OfertaDAO.arr.length; i++) {
//                        if(OfertaDAO.arr[i] != null) {
//                            if(OfertaDAO.arr[i].getProfessor().getId() == serv.getId()) {
//                                oferta[cont] = OfertaDAO.arr[i];
//                                cont++;
//                            }
//                        }
//                    }
                    
//                    cont = 0;
//                    Comissao comiss[] = new Comissao[10];
//                    for(int i = 0; i < ComissaoDAO.arr.length; i++) {
//                        if(ComissaoDAO.arr[i] != null) {
//                            for(int j = 0; j < ServidorComissaoDAO.arr.length; j++) {
//                                if(ServidorComissaoDAO.arr[j] != null) {
//                                    if(ComissaoDAO.arr[i].getComissao().equals(ServidorComissaoDAO.arr[j].getComissao()) && 
//                                            ServidorComissaoDAO.arr[j].getServidor() == serv) {
//                                        comiss[cont] = ComissaoDAO.arr[i];
                                        cont++;                            
//                                    }
//                                }
//                            }
//                        }
//                    }
                    
//                    cont = 0;
//                    Atividade ativid[] = new Atividade[10];
//                    for(int i = 0; i < AtividadeDAO.arr.length; i++) {
//                        if(AtividadeDAO.arr[i] != null) {
//                            if(AtividadeDAO.arr[i].getServidor() == serv) {
//                                ativid[cont] = AtividadeDAO.arr[i];
//                                cont++;
//                            }
//                        }
//                    }
//                    
//                    cont = 0;
//                    Orientacao ori[] = new Orientacao[10];
//                    for(int i = 0; i < OrientacaoDAO.arr.length; i++) {
//                        if(OrientacaoDAO.arr[i] != null) {
//                            if(OrientacaoDAO.arr[i].getServidor() == serv) {
//                                ori[cont] = OrientacaoDAO.arr[i];
//                                cont++;
//                            }
//                        }
//                    }
//                    
//                    rel = servidorDao.relatorioTrabalho(serv, oferta, comiss, ativid, ori);
//                    System.out.println(rel);
                    break;
                    
                case 15:
                    break;
                    
                default:
                    espaco.darEspaco();
                    System.out.println("Escolha invalida.");
                    break;
            }
        }while(escolha != 15);
    }
    
    
    private void subMenuCampus(CampusDAO obj) {
        
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador do Campus para buscar: ");                    
                     Campus r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Campus não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuServidor(ServidorDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador do Servidor para buscar: ");                    
                     Servidor r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Servidor não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuCurso(CursoDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador do Curso para buscar: ");                    
                     Curso r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Curso não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuDisciplina(DisciplinaDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador para buscar: ");                    
                     Disciplina r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuOferta(OfertaDisciplinaCursoDAO ofertaDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void subMenuAtividade(AtividadesDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador para buscar: ");                    
                     Atividades r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuOrientacao(OrientacoesDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                    System.out.println(obj.lista());
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador para buscar: ");                    
                     Orientacoes r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuComissao(ComissoesDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador para buscar: ");                    
                     Comissoes r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuServidorComissao(ServidoresComissoesDAO servidorComissaoDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void subMenuAtaReuniao(AtaReunioesDAO obj) {
        int escolha = 0;
        espaco.darEspaco();
        
        do {
          
            escolha = gui.daoCom();

            switch(escolha){
                case 1:
                     espaco.darEspaco();
                     System.out.println(obj.toString());
                    break;

                case 2:
                     espaco.darEspaco();
                     System.out.println(obj.toStringMin());
                     System.out.println("Informe o identificador para buscar: ");                    
                     AtaReunioes r = obj.buscaEspecifico(Long.parseLong(s.nextLine()));
                     System.out.println((r != null) ? r.toString() : "Não encontrado.");
                    break;

                case 3:
                  break;

                 default:
                      System.out.println("Opção invalida");
            }
             
        }while(escolha != 3);
    }

    private void subMenuAtaReuniaoPresentes(AtaReunioesPresentesDAO ataReuniaoPresentesDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
