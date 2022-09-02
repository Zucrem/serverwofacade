/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;
/**
 *
 * @author Zucrem
 */
public class FacadeServer{
    public void startServer(){
        ScheduleServer server = new ScheduleServer();
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    public void closeServer() {
        ScheduleServer server = new ScheduleServer();
        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destoryListeners();
        server.destoryContext();
        server.shutdown();
    }
}
