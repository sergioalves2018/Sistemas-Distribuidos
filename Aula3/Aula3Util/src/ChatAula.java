import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ChatAula extends UnicastRemoteObject implements IChatAula{
	
	private static final long serialVersionUID = 412321221L;

	public ChatAula() throws RemoteException{
		super();
	}

	@Override
	public void sendMessage(Message msg) throws RemoteException {
		Message.addLstMessage(msg);
	}

	@Override
	public List<Message> retriveMessage() throws RemoteException {
		return Message.getLstMessage();
	}

}
