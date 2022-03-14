package com.david.calculadora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.david.calculadora.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)







        var x1 : Float
        var x2 : Float
fun Somar() {
    binding.adicao.setOnClickListener {
        x1 = binding.editTextNumber.text.toString().toFloat()
        x2 = binding.editTextNumber2.text.toString().toFloat()

        var text = x1 + x2

        binding.textviewFirst.text = text.toString()
    }
}
        fun Dividir() {
            binding.divisao.setOnClickListener {
                x1 = binding.editTextNumber.text.toString().toFloat()
                x2 = binding.editTextNumber2.text.toString().toFloat()

                var text = x1 / x2

                binding.textviewFirst.text = text.toString()
            }
        }

        fun Multiplicar() {
            binding.multiplicacao.setOnClickListener {
                x1 = binding.editTextNumber.text.toString().toFloat()
                x2 = binding.editTextNumber2.text.toString().toFloat()

                var text = x1 * x2

                binding.textviewFirst.text = text.toString()
            }
        }

        fun Subtrair() {
            binding.subtracao.setOnClickListener {
                x1 = binding.editTextNumber.text.toString().toFloat()
                x2 = binding.editTextNumber2.text.toString().toFloat()

                var text = x1 - x2

                binding.textviewFirst.text = text.toString()
            }
        }

        binding.button10.setOnClickListener {Expressao("0", limpar = true)  }
        binding.button1.setOnClickListener {Expressao("1", limpar = true)  }
        binding.button2.setOnClickListener {Expressao("2", limpar = true)  }
        binding.button3.setOnClickListener {Expressao("3", limpar = true)  }
        binding.button4.setOnClickListener {Expressao("4", limpar = true)  }
        binding.button5.setOnClickListener {Expressao("5", limpar = true)  }
        binding.button6.setOnClickListener {Expressao("6", limpar = true)  }
        binding.button7.setOnClickListener {Expressao("7", limpar = true)  }
        binding.button8.setOnClickListener {Expressao("8", limpar = true)  }
        binding.button9.setOnClickListener {Expressao("9", limpar = true)  }

        binding.adicao.setOnClickListener { Somar() }
        binding.subtracao.setOnClickListener {Subtrair()  }
        binding.divisao.setOnClickListener {Dividir()  }
        binding.multiplicacao.setOnClickListener { Multiplicar()}

    fun ope(view: View){
        val botao = view
        when (botao.id){
            binding.adicao.id ->{
                Somar()
            }
        }
    }
        



    }


    fun Expressao(String: String, limpar : Boolean){
        if(binding.textviewFirst.text.isNotEmpty()){
            binding.editTextNumber.text = ""
        }
        if (limpar){
            binding.textviewFirst.text = ""
            binding.editTextNumber.append(String)
        }else{
            binding.editTextNumber2.append(binding.textviewFirst.text)
            binding.editTextNumber2.append(String)
            binding.textviewFirst.text = ""
        }




    }

    // aqui começa a loucura





    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}