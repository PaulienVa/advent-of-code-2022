#!/usr/bin/env kscript

package nl.paulienvanalst.adventOfCode.twentytwentytwo.Dec


val input = "nfddjzjjjmrjjfttzctzzhqzqbbvhhcfcpcqpcqpccsmsvsswbwzwfffnvfvpfvffhnnrgngzgrrhvhfhvvmjvjcccvppqdppbnbjjzlzflfccjjtctqccrhrnhnqhqwwjssjjhpjjcqqdgghddhfdfbffdpfdfzdddthhrcrbrqrbqqbcbnnwbbzcbzccmqqwllrljjjpqpdpsddmbmccwwgngmmzzzpbpspnprnppprmmwfwffrrpsrrchrrrrdqdfddnvnjnppqmqhhpshhjmhjhzjhhhzllbpbnnngdgzgmmjvvprrhqrhqhpqhqqrnqnddvjvvftfggfcgfffgrghhbmbzzjczzcscrccgbbjbqjbjsbsqbqttbqbfqqqrzrmzrmmcwcmwmrwmwnmnfnjjbdjbbslltjjmgmrmllhbhsbsmsqmqllvjjrvjrjcrrtztjzjbjsbbrjjvbjjgqjjpjsszpszsnznllvmlmfmppbvbzvvddtbtrbttchthjthjhnjnqnqrrllnflnnljnnzjjswjwllpmmpnnqnrrndnnbwwmcmcmbbhjjbbfpfvpvttcvvhshqqznzqqdndldmllpgptgptpbblzlddgqqdmmvpvvrccfvvjrvjjgpggqcggjbgbqqcgqccgppffjppzczmzdmmqppwcwlcwwhccfpcphcctvtzthtzhhnmnvmnnvqnqnpnqqwqsqdsszwzbwwgcwcrrtprrfhhcmcqcdcvdcccnpptgpgwpprsprsrdrtdrtrntrtprtppstsccbwwvnvpnvpnptpqttzbzcznzhzhddfbflfcchvchhplhlwhhlhglhhwqqzlqzlzvlvtlvtvrttglttslslclslqssslclbbrjrpjjcscfsfppjlplhplptlltlflglffdttmffrggfjjmllbnlnbnznqnfffmhhnmmsgmsmfsszggpnnhmhnnpwnndqqlmqmnmtnmtnttvtztlzlnzzsdsnssvhsszcscffcpczpcpffpwfwnwhnntnssptthccbnndppgjgpjpssbnnpgnpppjtjqqzfqqrrbmmbdddzjzvzwzssnpsnspnpvnpppjppvsvffmpffbcffslfsfmsmmqzzmttnsnqsqcsqsbqbcclqqphpttvrtrlrhrthhlppscsrsjjvljlmlwlslblqqqgdsbrzwzjzwcjrwbpfmjtmdgjvbcfvtvmsfjtjcmtlzmsjlnmhcswcmjndggdsmqfmmdngjpvrsbhrchldnhdhfdlwccnfmgbwfzppgzzcvblvsmqbfghrgdwlzdcvpqthgbdlwbrfpsvlgpdqznftswgwvchjfrblbdsqjmzchfhlrjhpbrdgvgrrmhrnrdbrdsfsgzvqfdtnvddbtcjwphrhgpqlzjssrgzjcncjnbrzvhgbwpgtfnqhpspmgptzcgvjqgzpmwtjtzldqnclmplwdpzcppgcbrsnlzfgmlnljjhfzrftnhdfnqchgdqrfcjszvbmdrghwzmjnwgnrlptljzqrwsmcfwvbcjgsfdjhnqgzzztmcgmndbtdwvqmzlfcmhfgpqztwgjdccncdccpgbcvhfzbhhbjhgjpdzcmrwgtvrmzdwjtmlzllmgplpqjwwwvbrzgmvpcvwchcwfgbjtzrfctgvfrpphbnsbjlswrztqmchtzfstzdgdwwvhpdhztbmsrbqmndpgvnwwdtgzcddvmvbjstqmjvtzlzgrhzhvplwnpphctvtlvnpmwfzmqcvrnfmmgtsgbcjpffrvbpqpszfpjsjtzqmcnzhnjnpwtvgfqntnhhjhmbvmlvmqgggrnfmmmsvfsqffbvwtzlfhlbjqhrltzwfstvjqhbbblqdbcmgtjgmzdtpslbzsgnmpzsswjlwdpzpmmvmpntbhnqlwrcrfbghzhwlhhpjqztjjrrfscrtwtnlqlqmdbmbfnvngvvthhghgsvqlqvgvmtjmjtwpcznzqhhfpqqfphcdrtzjjhsffslthzwpmsnltnjmfgpsjgqzdwrtgnhflhrnjwqftpnqgptgvgjptzhhtqhtddsfhppmmqcrsnlnrswpjhqgzbpwzfzptzqzzwltlrmjwjrwdgvvzhshqqrhtzmvqpfljlvpmrzbqpscpvsfdbdbcbdwwhpmldlrgpwslzhtbpgtzscfhjlgwcgbhcbftpftvpggvcdvndqnfvfqbwrjtdcbwpsbqpzmwdhjpmjhjmlcdphrjbgsnmcmvfnrggfvttclmbvsfjpnbndbblnbdfqzmsldlswdrtzqsqppjshtlrtccthmmpjgddbbgfgthnzdffbtrpchzgbvqvjcsnpgbrzrczzmzrmhjrlvvgmsqddjsqmcqfmwnhznbczzjlpmhnfwjtrfgffsjdlwgdwwlvdpdlvszphntrvttczgnwffsdsvjmqbthgcgfjgznrfnbplbvgsjbsglhnrjpbldhmznqgqpvldvhcpmmwzfjdjdbnprtrrnwsszjhmngvmtsrqdqdsprwhjpsqwqbsdtpptwlbfbsvdgrplrvpnfbzwrdsdbvhpgwcnqvwdcswdmdltchnngpmlqvchbnrpzcnfhvlzbwbnmssbhpvvmpcwvrwzpfpssndwwfnrslpjwhwrfsswmgtszrhczcrclpldpwpghgptmzzjjjtvjcnncjpfbcvldbnlnqtsqdswcsrqcfgvwbwdvbdwwzndfvcstjbfngtqqwsbpdjdgqdlsnwgcvmmhrqcqvdbqdqczzwzlfgffbwzbfdnpvprzmqclllsdvctwjfgqbchhmsntlvnlspwtnhgshwrvzccfmfrscqwrvdccwqnrccctjrvvnqbrphrfvfrfldbbthhrdzvdmfbctsmvgwmvpdslgbcpqqdvpsjcdvmctwghdsjtmhhvdswbcvtmsnsztfghnnfhflmmnmdqpvpdplllzgqgnsjwsrgzfwhrwhcscvrgcrgjdghqjfbswtgjsvnpqznrvbdbrplwdmbqhtbcfccnpwqlsdstnpcfpbfgqrzmcqhflmcfvbbnwrrblnfslsrwpwlbvqfhgpdwzmgvftssrvdmhnmwdfqmsvqbltlmmwmjrrhgpgznqbwhcqgphvzqmntbbdhhpnlbbffjgmcdntgwmtblwlzrcdcdbtrllrdnznrrsglnwhtwbrfdrpvgqwsgzwghbtsfwqlchgsnvfmvnzntlsnlwrnjjltrpmhwnzmhrqdlvvzbfgwlwgdsgcjcjfvhbcjgzlqtsljvzcvlppqdszvdbsmgddrtmvbcpbpppcpvhzfsjrmtcpzljbhpnjjmcdwslrhslccpljrtvcscbcltpshpnrqvtdfzbbfqtpbvznvrbflwvbvrhqpzltsdrnqccsfgzzftvjfqslcnmfvwtpdbjhtzwrgvntgnfvqtdrjdgglvrnqfzsbhnvhcdbctthdrjnvwlcsjtmphpvlqjngwjnngmqqnslrrsdfpfbvsvcwjtfmwtbpnnghtvvwlphbnsgflvsfdcqrctvjfjrwqjdmbbcclwvlstbgbfqjgbpbqfwdbpmnvqnfpbhrfhwltmcszpwnvtvhrvpcqhzdppjwttlhgsnvmsrwrnwvgzpbwljjjsjzctftzftvmsstpjnzvmmrgbbpmfmfrszwjdgzfhpvsfdqbbhgvfvqrrtqwlwzwwsnnmmvmlwjzvgrwhmffzwrqwbcdtbtzpspbnqgprdqtzrpmgvnmbsnjnvtzgmhqqtrvltbsrwjlssncdppgpmzqzbzvbpjpfwmvgsbhffzpbctmqvfwhsgdjtwqhrhmgnqpvmpjzhppvcbrpwmdshzcrwzdzcjmhfvjgtbznsmdjphlssmlmbhtmnsqnjfsjwhjvgztnwhmnztqppchngdnhzwpsvqqpzdwgbhcbzvmbnqmghbhgvrqhtfzhgvqdbpvdrjsqrdnhqhrwdlczvtnzwfrqhnffwdvtrnqsmmcjtrhmgbwcmnzbbvdsrlbbtwslhghwprpglpq"

println("Solution to part 1:")
val skippedBeforeFourUnique = input.toCharArray()
        .mapIndexed { index, _ -> if (index > 4 && input.subSequence(index - 3, index - 1).toSet().size < 4) { index to input.subSequence(index - 4, index).toSet().size } else index to 0 }
        .first { it.second == 4 }

println("Found ${skippedBeforeFourUnique.first}")


println("Solution to part 2:")

println("Found")
