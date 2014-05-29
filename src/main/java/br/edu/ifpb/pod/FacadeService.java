/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.pod;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */

public interface FacadeService extends Remote{
    Session login (String login, String password) throws RemoteException;
    void logout (Session sesion) throws RemoteException;
    Message sendMessage (Session session, Message message) throws RemoteException;
    boolean publish (ArrayList<Message> messages) throws RemoteException;
}
