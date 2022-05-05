using System;
Using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Task;
using System.Windows.Forms;

namespace Grades
{
    public partial class Form1 : Form
    {
       publice Fom1()
       {
           InitializeComponent();
       }
       
       private void Fom1_Load(obeject sender, EventArgs e)
       {
           
       }
       
       private void Check_click(object sender, EventArgs e)
       {
           try
           {
               string Name = nametext.Text;
               double English = Convert.ToDouble(textBox1.Text);
               double Math = Convert.ToDouble(textBox2.Text);
               double Sience = Convert.ToDouble(textBox3.Text);
               double Filipino = COnvert.ToDouble(textBox4.Text);
               double History = Convert.ToDouble(textBox5.Text);
               double Average = (English + Math + Science + Filipino + History) / 5;
               
               String AveragePass = (Average >=75) ? "The Student passed." : "The Student Failed";
               
               messagepass.Text = AveragePass;
               messagepass1.Text = "The General Average of " + Name + " is " + Average +".";
               
           }
           
           catch (Exception)
           {
               MessageBox.Show("Only Allowed Decimal Value");
           }
           
          }
    }
}