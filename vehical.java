using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public class vehical
    {
        private int id;
        private static TollBooth = new TollBooth();
        public vehicle(int id)
        {
            this.id=id;
        }
        public void exec()
        {
            Console.WriteLine("vehicle {0} starts journey",id+1);
            Random RandGen = new Random();
            int Rnd=RandGen .Next(0,100);
            travel (Rnd);
            Console.WriteLine("vehicle {0} arrives at the toll ", id+1);
            toll.useToll(this);
            travel (Rnd);
            Console.WriteLine("vehicle {0} has crossed the bridge ",id+1);
        }
        public int getVehicleId()
        {
            return this.id;
        }
        public void travel (int time)
        {
            int limit =500000;
            for(int j=0; j<time;j++)
            {
                for(int k =0 ; k<limit;k++)
                    (// do nothing);
                }
            }
    }
    public class TollBooth
    {
        bool inUse;
       
        public TollBooth()
        {
            inUse=false;
        }
        public void useToll(Vehicle vehicle)
        {
            if(inUse==false)
            {
                inUse=true;
                Console.WriteLine("vehicle {0} enters tollbooth ", vehicle.getVehicleId()+1);
                vehicle.travel(50);
                Console.WriteLine("Vehicle {0} exits tollbooth ",vehicle.getVehicleId()+1);
                inUse=false;
                break;
            }
        }
    }
}
public class Simulate
{
    private static int noOfVehicles =5;
    private static Vehicles[] vehicles;
    public static void Main(string[]args)
    {
        try
        {
            Simulate sm=new Simulate();
            vehicles=new Vehicles[5];
            for(int i=0;i<noOfVehicles;i++)
            {
                vehicles[i]=new Vehicles(i);
                Thread t=new Thread(new ThreadStart(vehicles[i].exec);
                t.Start();
                Thread.Sleep(100);
            }
            Console.ReadLine();
        }
        catch (Exception ex)
        {
            System.Console.WriteLine(ex);
        }
    }
}